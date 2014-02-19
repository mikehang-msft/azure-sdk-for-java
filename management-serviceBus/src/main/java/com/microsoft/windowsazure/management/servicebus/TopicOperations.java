/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus;

import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.servicebus.models.ServiceBusConnectionDetailsResponse;
import com.microsoft.windowsazure.management.servicebus.models.ServiceBusTopic;
import com.microsoft.windowsazure.management.servicebus.models.ServiceBusTopicResponse;
import com.microsoft.windowsazure.management.servicebus.models.ServiceBusTopicsResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* The Service Bus Management API includes operations for managing Service Bus
* topics for a namespace.
*/
public interface TopicOperations
{
    /**
    * Creates a new topic. Once created, this topic resource manifest is
    * immutable. This operation is not idempotent. Repeating the create call,
    * after a topic with same name has been created successfully, will result
    * in a 409 Conflict error message.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780728.aspx for
    * more information)
    *
    * @param namespaceName The namespace name.
    * @param topic The Service Bus topic.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return A response to a request for a particular topic.
    */
    ServiceBusTopicResponse create(String namespaceName, ServiceBusTopic topic) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException, URISyntaxException;
    
    /**
    * Creates a new topic. Once created, this topic resource manifest is
    * immutable. This operation is not idempotent. Repeating the create call,
    * after a topic with same name has been created successfully, will result
    * in a 409 Conflict error message.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780728.aspx for
    * more information)
    *
    * @param namespaceName The namespace name.
    * @param topic The Service Bus topic.
    * @return A response to a request for a particular topic.
    */
    Future<ServiceBusTopicResponse> createAsync(String namespaceName, ServiceBusTopic topic);
    
    /**
    * The topic description is an XML AtomPub document that defines the desired
    * semantics for a topic. The topic description contains the following
    * properties. For more information, see the TopicDescription Properties
    * topic.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    *
    * @param namespaceName The namespace name.
    * @param topicName The topic.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return A response to a request for a particular topic.
    */
    ServiceBusTopicResponse get(String namespaceName, String topicName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * The topic description is an XML AtomPub document that defines the desired
    * semantics for a topic. The topic description contains the following
    * properties. For more information, see the TopicDescription Properties
    * topic.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    *
    * @param namespaceName The namespace name.
    * @param topicName The topic.
    * @return A response to a request for a particular topic.
    */
    Future<ServiceBusTopicResponse> getAsync(String namespaceName, String topicName);
    
    /**
    * Gets the set of connection strings for a topic.
    *
    * @param namespaceName The namespace name.
    * @param topicName The topic.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The set of connection details for a service bus entity.
    */
    ServiceBusConnectionDetailsResponse getConnectionDetails(String namespaceName, String topicName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Gets the set of connection strings for a topic.
    *
    * @param namespaceName The namespace name.
    * @param topicName The topic.
    * @return The set of connection details for a service bus entity.
    */
    Future<ServiceBusConnectionDetailsResponse> getConnectionDetailsAsync(String namespaceName, String topicName);
    
    /**
    * Enumerates the topics in the service namespace. An empty feed is returned
    * if no topic exists in the service namespace.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780744.aspx for
    * more information)
    *
    * @param namespaceName The namespace name.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return A response to a request for a list of topics.
    */
    ServiceBusTopicsResponse list(String namespaceName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * Enumerates the topics in the service namespace. An empty feed is returned
    * if no topic exists in the service namespace.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780744.aspx for
    * more information)
    *
    * @param namespaceName The namespace name.
    * @return A response to a request for a list of topics.
    */
    Future<ServiceBusTopicsResponse> listAsync(String namespaceName);
    
    /**
    * Updates a topic.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj839740.aspx for
    * more information)
    *
    * @param namespaceName The namespace name.
    * @param topic The Service Bus topic.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A response to a request for a particular topic.
    */
    ServiceBusTopicResponse update(String namespaceName, ServiceBusTopic topic) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Updates a topic.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj839740.aspx for
    * more information)
    *
    * @param namespaceName The namespace name.
    * @param topic The Service Bus topic.
    * @return A response to a request for a particular topic.
    */
    Future<ServiceBusTopicResponse> updateAsync(String namespaceName, ServiceBusTopic topic);
}
