package test.java.lang.Runtime.exec;
/*
 * Copyright (c) 1999, 2001, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/* @test 1.4 00/10/18
   @bug 4231349
   @summary test runtime.exec on windows for extra space in cmd
 */
import java.io.*;

public class Space {
    public static void main(String[] args) throws Exception {
        if (File.separatorChar == '\\') {
            try {
            Process p = Runtime.getRuntime().exec( "cmd /c echo hello" );
            BufferedReader reader = new BufferedReader(
                                    new InputStreamReader(p.getInputStream()));
            p.waitFor();
            String echo = reader.readLine();
            if (echo.length() == 6)
                throw new RuntimeException("Extra space in command.");
            } catch (IOException e) {
            // not Win NT - cmd doesnt exist
            return;
            }
        }
    }
}