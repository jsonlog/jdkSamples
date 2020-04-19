package test.java.util.concurrent.forkjoin;
/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
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

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * @test
 * @bug 8078490
 * @summary Test submission and execution of task without joining
 */
public class SubmissionTest {
    public static void main(String[] args) throws Throwable {
        final ForkJoinPool e = new ForkJoinPool(1);
        final AtomicBoolean b = new AtomicBoolean();
        final Runnable setFalse = () -> b.set(false);
        for (int i = 0; i < 100000; i++) {
            b.set(true);
            e.execute(setFalse);
            long st = System.nanoTime();
            while (b.get()) {
                if (System.nanoTime() - st >= TimeUnit.SECONDS.toNanos(10)) {
                    throw new RuntimeException("Submitted task failed to execute");
                }
            }
        }
    }
}
