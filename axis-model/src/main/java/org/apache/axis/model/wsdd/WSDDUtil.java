/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.axis.model.wsdd;

import java.io.IOException;
import java.io.Writer;

import org.apache.axis.model.util.AxisXMLResource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

public final class WSDDUtil {
    private WSDDUtil() {}

    public static void write(Deployment deployment, Writer writer) throws IOException {
        AxisXMLResource resource = new AxisXMLResource();
        XMLProcessor processor = new XMLProcessor();
        resource.getContents().add(deployment);
        processor.save(writer, resource, null);        
    }
}
