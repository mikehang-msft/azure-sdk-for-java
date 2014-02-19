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

package com.microsoft.windowsazure.management.monitoring.alerts.models;

import java.util.Calendar;

/**
* An alert incident indicates the activation status of an alert rule.
*/
public class Incident
{
    private Calendar activatedTime;
    
    /**
    * The time at which the incident got activated.
    * @return The ActivatedTime value.
    */
    public Calendar getActivatedTime()
    {
        return this.activatedTime;
    }
    
    /**
    * The time at which the incident got activated.
    * @param activatedTimeValue The ActivatedTime value.
    */
    public void setActivatedTime(final Calendar activatedTimeValue)
    {
        this.activatedTime = activatedTimeValue;
    }
    
    private String id;
    
    /**
    * Incident identifier.
    * @return The Id value.
    */
    public String getId()
    {
        return this.id;
    }
    
    /**
    * Incident identifier.
    * @param idValue The Id value.
    */
    public void setId(final String idValue)
    {
        this.id = idValue;
    }
    
    private boolean isActive;
    
    /**
    * A boolean to indicate whether the incident is active or resolved.
    * @return The IsActive value.
    */
    public boolean isActive()
    {
        return this.isActive;
    }
    
    /**
    * A boolean to indicate whether the incident is active or resolved.
    * @param isActiveValue The IsActive value.
    */
    public void setIsActive(final boolean isActiveValue)
    {
        this.isActive = isActiveValue;
    }
    
    private Calendar resolvedTime;
    
    /**
    * The time at which the incident got resolved. If null, it means the
    * incident is still active.
    * @return The ResolvedTime value.
    */
    public Calendar getResolvedTime()
    {
        return this.resolvedTime;
    }
    
    /**
    * The time at which the incident got resolved. If null, it means the
    * incident is still active.
    * @param resolvedTimeValue The ResolvedTime value.
    */
    public void setResolvedTime(final Calendar resolvedTimeValue)
    {
        this.resolvedTime = resolvedTimeValue;
    }
    
    private String ruleId;
    
    /**
    * Rule identifier that is associated with the incident.
    * @return The RuleId value.
    */
    public String getRuleId()
    {
        return this.ruleId;
    }
    
    /**
    * Rule identifier that is associated with the incident.
    * @param ruleIdValue The RuleId value.
    */
    public void setRuleId(final String ruleIdValue)
    {
        this.ruleId = ruleIdValue;
    }
}
