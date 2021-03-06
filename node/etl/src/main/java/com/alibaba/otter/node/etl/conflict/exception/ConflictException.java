/*
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.alibaba.otter.node.etl.conflict.exception;

import org.apache.commons.lang.exception.NestableRuntimeException;

/**
 * @author jianghang 2012-4-12 下午02:59:12
 * @version 4.0.2
 */
public class ConflictException extends NestableRuntimeException {

    private static final long serialVersionUID = -7288830284122672209L;

    private String            errorCode;
    private String            errorDesc;

    public ConflictException(String errorCode){
        super(errorCode);
    }

    public ConflictException(String errorCode, Throwable cause){
        super(errorCode, cause);
    }

    public ConflictException(String errorCode, String errorDesc){
        super(errorCode + ":" + errorDesc);
    }

    public ConflictException(String errorCode, String errorDesc, Throwable cause){
        super(errorCode + ":" + errorDesc, cause);
    }

    public ConflictException(Throwable cause){
        super(cause);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
