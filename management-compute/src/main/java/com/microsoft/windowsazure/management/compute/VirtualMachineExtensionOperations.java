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

package com.microsoft.windowsazure.management.compute;

import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineExtensionListResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
* The Service Management API includes operations for managing the virtual
* machine extensions in your subscription.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/jj157206.aspx for more
* information)
*/
public interface VirtualMachineExtensionOperations
{
    /**
    * The List Resource Extensions operation lists the resource extensions that
    * are available to add to a Virtual Machine. In Windows Azure, a process
    * can run as a resource extension of a Virtual Machine. For example,
    * Remote Desktop Access or the Windows Azure Diagnostics Agent can run as
    * resource extensions to the Virtual Machine.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn495441.aspx for
    * more information)
    *
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
    * @return The List Resource Extensions operation response.
    */
    VirtualMachineExtensionListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * The List Resource Extensions operation lists the resource extensions that
    * are available to add to a Virtual Machine. In Windows Azure, a process
    * can run as a resource extension of a Virtual Machine. For example,
    * Remote Desktop Access or the Windows Azure Diagnostics Agent can run as
    * resource extensions to the Virtual Machine.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn495441.aspx for
    * more information)
    *
    * @return The List Resource Extensions operation response.
    */
    Future<VirtualMachineExtensionListResponse> listAsync();
    
    /**
    * The List Resource Extension Versions operation lists the versions of a
    * resource extension that are available to add to a Virtual Machine. In
    * Windows Azure, a process can run as a resource extension of a Virtual
    * Machine. For example, Remote Desktop Access or the Windows Azure
    * Diagnostics Agent can run as resource extensions to the Virtual Machine.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/dn495440.aspx
    * for more information)
    *
    * @param publisherName The name of the publisher.
    * @param extensionName The name of the extension.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The List Resource Extensions operation response.
    */
    VirtualMachineExtensionListResponse listVersions(String publisherName, String extensionName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * The List Resource Extension Versions operation lists the versions of a
    * resource extension that are available to add to a Virtual Machine. In
    * Windows Azure, a process can run as a resource extension of a Virtual
    * Machine. For example, Remote Desktop Access or the Windows Azure
    * Diagnostics Agent can run as resource extensions to the Virtual Machine.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/dn495440.aspx
    * for more information)
    *
    * @param publisherName The name of the publisher.
    * @param extensionName The name of the extension.
    * @return The List Resource Extensions operation response.
    */
    Future<VirtualMachineExtensionListResponse> listVersionsAsync(String publisherName, String extensionName);
}
