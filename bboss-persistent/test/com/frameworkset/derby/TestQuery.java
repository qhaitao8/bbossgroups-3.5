/*
 *  Copyright 2008 biaoping.yin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.frameworkset.derby;

import java.sql.SQLException;

import com.frameworkset.common.poolman.PreparedDBUtil;

/**
 * <p>Title: TestQuery.java</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2007</p>
 * @Date 2010-1-29 下午06:19:39
 * @author biaoping.yin
 * @version 1.0
 */
public class TestQuery
{
    @org.junit.Test
    public void test() throws SQLException
    {
        PreparedDBUtil dbUtil = new PreparedDBUtil();
        dbUtil.executeSelect("secondderby","select * from tableinfo");
        System.out.println("dbUtil.size():"+dbUtil.size());
        
        dbUtil.executeSelect("secondderby","select * from MQ_NODE");
        System.out.print("dbUtil.size():"+dbUtil.size());
        
    }
}
