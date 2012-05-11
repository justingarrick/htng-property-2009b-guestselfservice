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

import javax.xml.ws.Endpoint;

/**
 * Contains a main method that can be invoked to publish
 * GuestSelfService for testing.
 * 
 * @author Justin Garrick
 */
public class EndpointPublisher {

	/**
	 * A simple main method that publishes GuestSelfService
	 * on localhost:8080.
	 * 
	 * @param args the program arguments
	 */
	public static void main(final String... args) {
		Endpoint.publish("http://0.0.0.0:8080/GuestSelfService", new GuestSelfService());
	}

}
