/*
 *Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *WSO2 Inc. licenses this file to you under the Apache License,
 *Version 2.0 (the "License"); you may not use this file except
 *in compliance with the License.
 *You may obtain a copy of the License at
 *
 *http://www.apache.org/licenses/LICENSE-2.0
 *
 *Unless required by applicable law or agreed to in writing,
 *software distributed under the License is distributed on an
 *"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *KIND, either express or implied.  See the License for the
 *specific language governing permissions and limitations
 *under the License.
 */
package org.wso2.carbon.esb.samples.test.mediation;

import org.apache.axiom.om.OMElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.wso2.carbon.esb.samples.test.util.ESBSampleIntegrationTest;

import static org.testng.Assert.assertTrue;

public class Sample400TestCase extends ESBSampleIntegrationTest {

    @BeforeClass
    public void setEnvironment() throws Exception {
        init();
    }

    @Test(groups = "wso2.esb", description = "Tests with continue parent=true")
    public void testContinueParentTrue() throws Exception, InterruptedException {

        OMElement response = axis2Client
                .sendMultipleQuoteRequest(getProxyServiceURLHttp("Sample400TestCaseProxy"), null, "WSO2", 4);
        assertTrue(response.toString().contains("WSO2"));

    }

}
