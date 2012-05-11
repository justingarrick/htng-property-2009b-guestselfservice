/*
 * Copyright (C) 2012 Justin Garrick.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.justingarrick.htng.property.guestselfservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.htng.property.guestselfservice.FetchProfileRequest;
import org.htng.property.guestselfservice.FetchProfileResponse;
import org.htng.property.guestselfservice.LookupRequest;
import org.htng.property.guestselfservice.LookupResponse;
import org.htng.property.guestselfservice.NewProfileRequest;
import org.htng.property.guestselfservice.NewProfileResponse;
import org.htng.property.guestselfservice.ObjectFactory;
import org.htng.property.guestselfservice.SubscriptionResponse;
import org.htng.property.guestselfservice.UpdateProfileRequest;
import org.htng.property.guestselfservice.UpdateProfileResponse;

/**
 * This is a sample JAX-WS SOAP service that implements dummy methods for 
 * a subset of the GuestSelfService operations in the 
 * <a href="http://collaboration.htng.org/specs/">HTNG 2009B Property specification</a>.
 * Although this is the 2009B spec, the schemas declare
 * 2009A namespaces.  Namespaces, operation, and binding
 * names adhere as closely as possible to the HTNG specification
 * and example WSDL.
 * 
 * @author Justin Garrick
 */
@WebService(targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService", name = "NamePortType", serviceName = "GuestSelfService", portName = "NamePortType")
//@Addressing(enabled=true, required=true)
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class GuestSelfService {
	
	/**
	 * This SOAP operation fetches a HTNG profile.
	 * 
	 * @param request a populated HTNG FetchProfileRequest object
	 * @return a HTNG FetchProfileResponse object
	 */
	@WebResult(name = "FetchProfileResponse", targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService/Name/Types", partName = "FetchProfileResponse")
    @WebMethod(operationName = "FetchProfile", action = "http://htng.org/PWS/2009A/GuestSelfService#FetchProfile")
	public FetchProfileResponse fetchProfile(
		@WebParam(partName = "FetchProfileRequest", name = "FetchProfileRequest", targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService/Name/Types")
		final FetchProfileRequest request
	) {
		FetchProfileResponse response = new FetchProfileResponse();
		// do some processing
		return response;
	}
	
	/**
	 * This SOAP operation creates a new HTNG profile.
	 * 
	 * @param request a populated HTNG NewProfileRequest object
	 * @return a HTNG NewProfileResponse object
	 */
	@WebResult(name = "NewProfileResponse", targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService/Name/Types", partName = "NewProfileResponse")
    @WebMethod(operationName = "NewProfile", action = "http://htng.org/PWS/2009A/GuestSelfService#NewProfile")
	public NewProfileResponse newProfile(
		@WebParam(partName = "NewProfileRequest", name = "NewProfileRequest", targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService/Name/Types")
		final NewProfileRequest request
	) {
		NewProfileResponse response = new NewProfileResponse();
		// do some processing
		return response;
	}
	
	/**
	 * This SOAP operation updates a existing HTNG profile.
	 * 
	 * @param request a populated HTNG UpdateProfileRequest object
	 * @return a HTNG UpdateProfileResponse object
	 */
	@WebResult(name = "UpdateProfileResponse", targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService/Name/Types", partName = "UpdateProfileResponse")
    @WebMethod(operationName = "UpdateProfile", action = "http://htng.org/PWS/2009A/GuestSelfService#UpdateProfile")
    public UpdateProfileResponse updateProfile(
        @WebParam(partName = "UpdateProfileRequest", name = "UpdateProfileRequest", targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService/Name/Types")
        final UpdateProfileRequest request
    ) {
		UpdateProfileResponse response = new UpdateProfileResponse();
		// do some processing
		return response;
	}
	
	/**
	 * This SOAP operation looks up a HTNG profile.
	 * 
	 * @param request a populated HTNG LookupRequest object
	 * @return a HTNG LookupResponse object
	 */
	@WebResult(name = "ProfileLookupResponse", targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService/Name/Types", partName = "ProfileLookupResponse")
    @WebMethod(operationName = "ProfileLookup", action = "http://htng.org/PWS/2009A/GuestSelfService#ProfileLookup")
    public LookupResponse profileLookup(
        @WebParam(partName = "ProfileLookupRequest", name = "ProfileLookupRequest", targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService/Name/Types")
        final LookupRequest request
    ) {
		LookupResponse response = new LookupResponse();
		// do some processing
		return response;
	}
	
	/**
	 * This SOAP operation retrieves a HTNG subscription.
	 * 
	 * @param request a populated HTNG SubscriptionRequest object
	 * @return a HTNG SubscriptionResponse object
	 */
	@WebResult(name = "SubscriptionResponse", targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService/Name/Types", partName = "SubscriptionResponse")
    @WebMethod(operationName = "Subscription", action = "http://htng.org/PWS/2009A/GuestSelfService#Subscription")
    public SubscriptionResponse subscription(
        @WebParam(partName = "SubscriptionRequest", name = "SubscriptionRequest", targetNamespace = "http://htng.org/PWS/2009A/GuestSelfService/Name/Types")
        final LookupRequest request
    ) {
		SubscriptionResponse response = new SubscriptionResponse();
		// do some processing
		return response;
	}
	
}
