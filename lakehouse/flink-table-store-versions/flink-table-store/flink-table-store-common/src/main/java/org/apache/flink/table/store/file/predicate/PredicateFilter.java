/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.store.file.predicate;

import org.apache.flink.table.data.RowData;
import org.apache.flink.table.store.utils.RowDataToObjectArrayConverter;
import org.apache.flink.table.types.logical.RowType;

import javax.annotation.Nullable;

/** A {@link java.util.function.Predicate} to filter {@link RowData}. */
public class PredicateFilter implements java.util.function.Predicate<RowData> {

    private final RowDataToObjectArrayConverter arrayConverter;
    @Nullable private final Predicate predicate;

    public PredicateFilter(RowType rowType, @Nullable Predicate predicate) {
        this.arrayConverter = new RowDataToObjectArrayConverter(rowType);
        this.predicate = predicate;
    }

    @Override
    public boolean test(RowData rowData) {
        return predicate == null || predicate.test(arrayConverter.convert(rowData));
    }
}
