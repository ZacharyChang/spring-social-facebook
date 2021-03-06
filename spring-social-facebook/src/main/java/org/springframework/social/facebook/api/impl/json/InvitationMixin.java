/*
 * Copyright 2015 the original author or authors.
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
package org.springframework.social.facebook.api.impl.json;

import java.util.Date;

import org.springframework.social.facebook.api.RsvpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Annotated mixin to add Jackson annotations to Invitation. 
 * @author Craig Walls
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class InvitationMixin extends FacebookObjectMixin {

	@JsonProperty("id")
	String eventId;
	
	@JsonProperty("name")
	String name;
	
	@JsonProperty("start_time")
	Date startTime;
	
	@JsonProperty("end_time")
	Date endTime;
	
	@JsonProperty("rsvp_status") 
	@JsonDeserialize(using=RsvpStatusDeserializer.class) 
	RsvpStatus rsvpStatus;
	
	@JsonProperty("location")
	String location;
	
	@JsonProperty("timezone")
	String timeZone;
}
