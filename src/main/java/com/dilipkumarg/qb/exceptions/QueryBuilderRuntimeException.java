/*
 * Copyright 2014-15 Dilip Kumar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dilipkumarg.qb.exceptions;

/**
 * This exception thrown when {@link com.dilipkumarg.qb.core.QueryBuilder} unable to process further.
 *
 * @author Dilip Kumar.
 * @since 4/7/14
 */
public class QueryBuilderRuntimeException extends RuntimeException {
    public QueryBuilderRuntimeException(String message, Throwable th) {
        super(message, th);
    }

    public QueryBuilderRuntimeException(String message) {
        super(message);
    }
}
