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


import com.platform.utils.job.RunTimeException;

import java.util.Collection;
import java.util.Map;

/**
 * Asserts
 *
 * @author AllDataDC
 * @date 2022/11/5 21:57
 */
public class Asserts {

    public static boolean isNotNull(Object object) {
        return object != null;
    }

    public static boolean isNull(Object object) {
        return object == null;
    }

    public static boolean isNullString(String str) {
        return isNull(str) || "".equals(str);
    }

    public static boolean isAllNullString(String... str) {
        boolean isNull = true;
        for (String item : str) {
            if (isNotNullString(item)) {
                isNull = false;
            }
        }
        return isNull;
    }

    public static boolean isNotNullString(String str) {
        return !isNullString(str);
    }

    public static boolean isAllNotNullString(String... str) {
        boolean isNotNull = true;
        for (String item : str) {
            if (isNullString(item)) {
                isNotNull = false;
            }
        }
        return isNotNull;
    }

    public static boolean isEquals(String str1, String str2) {
        if (isNull(str1) && isNull(str2)) {
            return true;
        } else if (isNull(str1) || isNull(str2)) {
            return false;
        } else {
            return str1.equals(str2);
        }
    }

    public static boolean isEqualsIgnoreCase(String str1, String str2) {
        if (isNull(str1) && isNull(str2)) {
            return true;
        } else if (isNull(str1) || isNull(str2)) {
            return false;
        } else {
            return str1.equalsIgnoreCase(str2);
        }
    }

    public static boolean isNullCollection(Collection collection) {
        if (isNull(collection) || collection.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNotNullCollection(Collection collection) {
        return !isNullCollection(collection);
    }

    public static boolean isNullMap(Map map) {
        if (isNull(map) || map.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNotNullMap(Map map) {
        return !isNullMap(map);
    }

    public static void checkNull(Object key, String msg) {
        if (key == null) {
            throw new RunTimeException(msg);
        }
    }

    public static void checkNotNull(Object object, String msg) {
        if (isNull(object)) {
            throw new RunTimeException(msg);
        }
    }

    public static void checkNullString(String key, String msg) {
        if (isNull(key) || isEquals("", key)) {
            throw new RunTimeException(msg);
        }
    }

    public static void checkNullCollection(Collection collection, String msg) {
        if (isNullCollection(collection)) {
            throw new RunTimeException(msg);
        }
    }

    public static void checkNullMap(Map map, String msg) {
        if (isNullMap(map)) {
            throw new RunTimeException(msg);
        }
    }
}
