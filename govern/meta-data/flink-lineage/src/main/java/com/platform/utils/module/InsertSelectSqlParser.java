/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.platform.utils.module;

import com.platform.utils.job.SqlSegment;

/**
 * InsertSelectSqlParser
 *
 * @author AllDataDC
 * @date 2022/11/14 16:53
 */
public class InsertSelectSqlParser extends BaseSingleSqlParser {

    public InsertSelectSqlParser(String originalSql) {
        super(originalSql);
    }

    @Override
    protected void initializeSegments() {
        segments.add(new SqlSegment("(insert\\s+into)(.+)( select )", "[,]"));
        segments.add(new SqlSegment("(select)(.+)(from)", "[,]"));
        segments.add(new SqlSegment("(from)(.+?)( where | on | having | group\\s+by | order\\s+by | ENDOFSQL)", "(,|\\s+left\\s+join\\s+|\\s+right\\s+join\\s+|\\s+inner\\s+join\\s+)"));
        segments.add(new SqlSegment("(where|on|having)(.+?)( group\\s+by | order\\s+by | ENDOFSQL)", "(and|or)"));
        segments.add(new SqlSegment("(group\\s+by)(.+?)( order\\s+by| ENDOFSQL)", "[,]"));
        segments.add(new SqlSegment("(order\\s+by)(.+?)( ENDOFSQL)", "[,]"));
    }
}
