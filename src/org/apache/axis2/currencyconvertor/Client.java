package org.apache.axis2.currencyconvertor;

import org.apache.axis2.currencyconvertor.CurrencyConvertorStub.ConversionRate;
import org.apache.axis2.currencyconvertor.CurrencyConvertorStub.ConversionRateResponse;
import org.apache.axis2.currencyconvertor.CurrencyConvertorStub.Currency;
public class Client {
	public static void main(String[] args) {
		 try {

		       //Create the stub object by passing the service end point url
		       CurrencyConvertorStub stub = new CurrencyConvertorStub("http://www.webservicex.net/CurrencyConvertor.asmx");
		       //ConversionRate is the class which we have to use mention the from and to currency
		       //ConversionRate object will be the parameter for the conversionRate operation
		       ConversionRate conversionRate = new ConversionRate();
		       conversionRate.setFromCurrency(Currency.USD);
		       conversionRate.setToCurrency(Currency.INR);

		       //Create the ConversionRateResponse object, which is going to be used to catch the response
		       //call the conversionRate service using the stub object
		       ConversionRateResponse conversionRateResponse = stub.conversionRate(conversionRate);

		       //We can use the conversionRateResponse object to retrieve the response of the ConversionRate Service
		       System.out.println("Conversion Rate from INR to USD : " + conversionRateResponse.getConversionRateResult());

		       } catch (Exception e) {
		       e.printStackTrace();
		      }
		    }
		}
				