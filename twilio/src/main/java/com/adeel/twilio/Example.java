package com.adeel.twilio;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Sms;

public class Example {
	
	public static final String ACCOUNT_SID = "AC86c6f1e8a792c259edcb7e588d745c32";
	public static final String AUTH_TOKEN = "aa064525e2749d6139c7a391f86bd87c";

	public static void main(String[] args) throws TwilioRestException {
		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
		// Build a filter for the SmsList
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("Body", "All in the game, yo"));
		params.add(new BasicNameValuePair("To", "+923004276039"));
		params.add(new BasicNameValuePair("From", "+15005550006"));
		SmsFactory smsFactory = client.getAccount().getSmsFactory();
		Sms sms = smsFactory.create(params);
		System.out.println(sms.getSid());
	}

}
