/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * AccessLog StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessLogStaxUnmarshaller implements Unmarshaller<AccessLog, StaxUnmarshallerContext> {

    public AccessLog unmarshall(StaxUnmarshallerContext context) throws Exception {
        AccessLog accessLog = new AccessLog();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return accessLog;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Enabled", targetDepth)) {
                    accessLog.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("S3BucketName", targetDepth)) {
                    accessLog.setS3BucketName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EmitInterval", targetDepth)) {
                    accessLog.setEmitInterval(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("S3BucketPrefix", targetDepth)) {
                    accessLog.setS3BucketPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return accessLog;
                }
            }
        }
    }

    private static AccessLogStaxUnmarshaller instance;

    public static AccessLogStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccessLogStaxUnmarshaller();
        return instance;
    }
}
