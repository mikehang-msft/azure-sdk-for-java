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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
* The List OS Images operation response.
*/
public class VirtualMachineImageListResponse extends OperationResponse implements Iterable<VirtualMachineImageListResponse.VirtualMachineImage>
{
    private ArrayList<VirtualMachineImageListResponse.VirtualMachineImage> images;
    
    /**
    * The virtual machine images associated with your subscription.
    * @return The Images value.
    */
    public ArrayList<VirtualMachineImageListResponse.VirtualMachineImage> getImages()
    {
        return this.images;
    }
    
    /**
    * The virtual machine images associated with your subscription.
    * @param imagesValue The Images value.
    */
    public void setImages(final ArrayList<VirtualMachineImageListResponse.VirtualMachineImage> imagesValue)
    {
        this.images = imagesValue;
    }
    
    /**
    * Initializes a new instance of the VirtualMachineImageListResponse class.
    *
    */
    public VirtualMachineImageListResponse()
    {
        super();
        this.images = new ArrayList<VirtualMachineImageListResponse.VirtualMachineImage>();
    }
    
    /**
    * Gets the sequence of Images.
    *
    */
    public Iterator<VirtualMachineImageListResponse.VirtualMachineImage> iterator()
    {
        return this.getImages().iterator();
    }
    
    /**
    * A virtual machine image associated with your subscription.
    */
    public static class VirtualMachineImage
    {
        private String affinityGroup;
        
        /**
        * The affinity in which the media is located. The AffinityGroup value
        * is derived from storage account that contains the blob in which the
        * media is located. If the storage account does not belong to an
        * affinity group the value is NULL and the element is not displayed in
        * the response.  This value is NULL for platform images.
        * @return The AffinityGroup value.
        */
        public String getAffinityGroup()
        {
            return this.affinityGroup;
        }
        
        /**
        * The affinity in which the media is located. The AffinityGroup value
        * is derived from storage account that contains the blob in which the
        * media is located. If the storage account does not belong to an
        * affinity group the value is NULL and the element is not displayed in
        * the response.  This value is NULL for platform images.
        * @param affinityGroupValue The AffinityGroup value.
        */
        public void setAffinityGroup(final String affinityGroupValue)
        {
            this.affinityGroup = affinityGroupValue;
        }
        
        private String category;
        
        /**
        * The repository classification of the image. All user images have the
        * category User.
        * @return The Category value.
        */
        public String getCategory()
        {
            return this.category;
        }
        
        /**
        * The repository classification of the image. All user images have the
        * category User.
        * @param categoryValue The Category value.
        */
        public void setCategory(final String categoryValue)
        {
            this.category = categoryValue;
        }
        
        private String description;
        
        /**
        * Specifies the description of the image.
        * @return The Description value.
        */
        public String getDescription()
        {
            return this.description;
        }
        
        /**
        * Specifies the description of the image.
        * @param descriptionValue The Description value.
        */
        public void setDescription(final String descriptionValue)
        {
            this.description = descriptionValue;
        }
        
        private String eula;
        
        /**
        * Specifies the End User License Agreement that is associated with the
        * image. The value for this element is a string, but it is recommended
        * that the value be a URL that points to a EULA.
        * @return The Eula value.
        */
        public String getEula()
        {
            return this.eula;
        }
        
        /**
        * Specifies the End User License Agreement that is associated with the
        * image. The value for this element is a string, but it is recommended
        * that the value be a URL that points to a EULA.
        * @param eulaValue The Eula value.
        */
        public void setEula(final String eulaValue)
        {
            this.eula = eulaValue;
        }
        
        private String imageFamily;
        
        /**
        * Specifies a value that can be used to group images.
        * @return The ImageFamily value.
        */
        public String getImageFamily()
        {
            return this.imageFamily;
        }
        
        /**
        * Specifies a value that can be used to group images.
        * @param imageFamilyValue The ImageFamily value.
        */
        public void setImageFamily(final String imageFamilyValue)
        {
            this.imageFamily = imageFamilyValue;
        }
        
        private Boolean isPremium;
        
        /**
        * Indicates whether the image contains software or associated services
        * that will incur charges above the core price for the virtual
        * machine. For additional details, see the PricingDetailLink element.
        * @return The IsPremium value.
        */
        public Boolean isPremium()
        {
            return this.isPremium;
        }
        
        /**
        * Indicates whether the image contains software or associated services
        * that will incur charges above the core price for the virtual
        * machine. For additional details, see the PricingDetailLink element.
        * @param isPremiumValue The IsPremium value.
        */
        public void setIsPremium(final Boolean isPremiumValue)
        {
            this.isPremium = isPremiumValue;
        }
        
        private String label;
        
        /**
        * An identifier for the image.
        * @return The Label value.
        */
        public String getLabel()
        {
            return this.label;
        }
        
        /**
        * An identifier for the image.
        * @param labelValue The Label value.
        */
        public void setLabel(final String labelValue)
        {
            this.label = labelValue;
        }
        
        private String language;
        
        /**
        * Specifies the language of the image.  The Language element is only
        * available using version 2013-03-01 or higher.
        * @return The Language value.
        */
        public String getLanguage()
        {
            return this.language;
        }
        
        /**
        * Specifies the language of the image.  The Language element is only
        * available using version 2013-03-01 or higher.
        * @param languageValue The Language value.
        */
        public void setLanguage(final String languageValue)
        {
            this.language = languageValue;
        }
        
        private String location;
        
        /**
        * The geo-location in which this media is located. The Location value
        * is derived from storage account that contains the blob in which the
        * media is located. If the storage account belongs to an affinity
        * group the value is NULL.  If the version is set to 2012-08-01 or
        * later, the locations are returned for platform images; otherwise,
        * this value is NULL for platform images.
        * @return The Location value.
        */
        public String getLocation()
        {
            return this.location;
        }
        
        /**
        * The geo-location in which this media is located. The Location value
        * is derived from storage account that contains the blob in which the
        * media is located. If the storage account belongs to an affinity
        * group the value is NULL.  If the version is set to 2012-08-01 or
        * later, the locations are returned for platform images; otherwise,
        * this value is NULL for platform images.
        * @param locationValue The Location value.
        */
        public void setLocation(final String locationValue)
        {
            this.location = locationValue;
        }
        
        private double logicalSizeInGB;
        
        /**
        * The size, in GB, of the image.
        * @return The LogicalSizeInGB value.
        */
        public double getLogicalSizeInGB()
        {
            return this.logicalSizeInGB;
        }
        
        /**
        * The size, in GB, of the image.
        * @param logicalSizeInGBValue The LogicalSizeInGB value.
        */
        public void setLogicalSizeInGB(final double logicalSizeInGBValue)
        {
            this.logicalSizeInGB = logicalSizeInGBValue;
        }
        
        private URI mediaLinkUri;
        
        /**
        * The location of the blob in Windows Azure storage. The blob location
        * belongs to a storage account in the subscription specified by the
        * SubscriptionId value in the operation call.  Example:
        * http://example.blob.core.windows.net/disks/myimage.vhd
        * @return The MediaLinkUri value.
        */
        public URI getMediaLinkUri()
        {
            return this.mediaLinkUri;
        }
        
        /**
        * The location of the blob in Windows Azure storage. The blob location
        * belongs to a storage account in the subscription specified by the
        * SubscriptionId value in the operation call.  Example:
        * http://example.blob.core.windows.net/disks/myimage.vhd
        * @param mediaLinkUriValue The MediaLinkUri value.
        */
        public void setMediaLinkUri(final URI mediaLinkUriValue)
        {
            this.mediaLinkUri = mediaLinkUriValue;
        }
        
        private String name;
        
        /**
        * The name of the operating system image. This is the name that is used
        * when creating one or more virtual machines using the image.
        * @return The Name value.
        */
        public String getName()
        {
            return this.name;
        }
        
        /**
        * The name of the operating system image. This is the name that is used
        * when creating one or more virtual machines using the image.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue)
        {
            this.name = nameValue;
        }
        
        private String operatingSystemType;
        
        /**
        * The operating system type of the OS image. Possible values are:
        * Linux, Windows.
        * @return The OperatingSystemType value.
        */
        public String getOperatingSystemType()
        {
            return this.operatingSystemType;
        }
        
        /**
        * The operating system type of the OS image. Possible values are:
        * Linux, Windows.
        * @param operatingSystemTypeValue The OperatingSystemType value.
        */
        public void setOperatingSystemType(final String operatingSystemTypeValue)
        {
            this.operatingSystemType = operatingSystemTypeValue;
        }
        
        private URI pricingDetailUri;
        
        /**
        * Specifies a URL for an image with IsPremium set to true, which
        * contains the pricing details for a virtual machine that is created
        * from the image.  The PricingDetailLink element is only available
        * using version 2012-12-01 or higher.
        * @return The PricingDetailUri value.
        */
        public URI getPricingDetailUri()
        {
            return this.pricingDetailUri;
        }
        
        /**
        * Specifies a URL for an image with IsPremium set to true, which
        * contains the pricing details for a virtual machine that is created
        * from the image.  The PricingDetailLink element is only available
        * using version 2012-12-01 or higher.
        * @param pricingDetailUriValue The PricingDetailUri value.
        */
        public void setPricingDetailUri(final URI pricingDetailUriValue)
        {
            this.pricingDetailUri = pricingDetailUriValue;
        }
        
        private URI privacyUri;
        
        /**
        * Specifies the URI that points to a document that contains the privacy
        * policy related to the image.
        * @return The PrivacyUri value.
        */
        public URI getPrivacyUri()
        {
            return this.privacyUri;
        }
        
        /**
        * Specifies the URI that points to a document that contains the privacy
        * policy related to the image.
        * @param privacyUriValue The PrivacyUri value.
        */
        public void setPrivacyUri(final URI privacyUriValue)
        {
            this.privacyUri = privacyUriValue;
        }
        
        private Calendar publishedDate;
        
        /**
        * Specifies the date when the image was added to the image repository.
        * @return The PublishedDate value.
        */
        public Calendar getPublishedDate()
        {
            return this.publishedDate;
        }
        
        /**
        * Specifies the date when the image was added to the image repository.
        * @param publishedDateValue The PublishedDate value.
        */
        public void setPublishedDate(final Calendar publishedDateValue)
        {
            this.publishedDate = publishedDateValue;
        }
        
        private String publisherName;
        
        /**
        * The name of the publisher of this OS Image in Windows Azure.
        * @return The PublisherName value.
        */
        public String getPublisherName()
        {
            return this.publisherName;
        }
        
        /**
        * The name of the publisher of this OS Image in Windows Azure.
        * @param publisherNameValue The PublisherName value.
        */
        public void setPublisherName(final String publisherNameValue)
        {
            this.publisherName = publisherNameValue;
        }
        
        private String recommendedVMSize;
        
        /**
        * Optional. Specifies the size to use for the virtual machine that is
        * created from the OS image.
        * @return The RecommendedVMSize value.
        */
        public String getRecommendedVMSize()
        {
            return this.recommendedVMSize;
        }
        
        /**
        * Optional. Specifies the size to use for the virtual machine that is
        * created from the OS image.
        * @param recommendedVMSizeValue The RecommendedVMSize value.
        */
        public void setRecommendedVMSize(final String recommendedVMSizeValue)
        {
            this.recommendedVMSize = recommendedVMSizeValue;
        }
        
        private URI smallIconUri;
        
        /**
        * Specifies the URI to the small icon that is displayed when the image
        * is presented in the Windows Azure Management Portal.  The
        * SmallIconUri element is only available using version 2013-03-01 or
        * higher.
        * @return The SmallIconUri value.
        */
        public URI getSmallIconUri()
        {
            return this.smallIconUri;
        }
        
        /**
        * Specifies the URI to the small icon that is displayed when the image
        * is presented in the Windows Azure Management Portal.  The
        * SmallIconUri element is only available using version 2013-03-01 or
        * higher.
        * @param smallIconUriValue The SmallIconUri value.
        */
        public void setSmallIconUri(final URI smallIconUriValue)
        {
            this.smallIconUri = smallIconUriValue;
        }
    }
}
