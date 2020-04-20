package test.java.rmi.activation.Activatable.checkAnnotations;
/*
 * Copyright (c) 1998, 1999, Oracle and/or its affiliates. All rights reserved.
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

// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

public final class CheckAnnotations_Stub
    extends java.rmi.server.RemoteStub
    implements MyRMI, java.rmi.Remote
{
    private static final java.rmi.server.Operation[] operations = {
        new java.rmi.server.Operation("void printErr(java.lang.String)"),
        new java.rmi.server.Operation("void printOut(java.lang.String)"),
        new java.rmi.server.Operation("void shutdown()")
    };

    private static final long interfaceHash = -3955951123118841923L;

    private static final long serialVersionUID = 2;

    private static boolean useNewInvoke;
    private static java.lang.reflect.Method $method_printErr_0;
    private static java.lang.reflect.Method $method_printOut_1;
    private static java.lang.reflect.Method $method_shutdown_2;

    static {
        try {
            java.rmi.server.RemoteRef.class.getMethod("invoke",
                new java.lang.Class[] {
                    java.rmi.Remote.class,
                    java.lang.reflect.Method.class,
                    java.lang.Object[].class,
                    long.class
                });
            useNewInvoke = true;
            $method_printErr_0 = MyRMI.class.getMethod("printErr", new java.lang.Class[] {java.lang.String.class});
            $method_printOut_1 = MyRMI.class.getMethod("printOut", new java.lang.Class[] {java.lang.String.class});
            $method_shutdown_2 = MyRMI.class.getMethod("shutdown", new java.lang.Class[] {});
        } catch (java.lang.NoSuchMethodException e) {
            useNewInvoke = false;
        }
    }

    // constructors
    public CheckAnnotations_Stub() {
        super();
    }
    public CheckAnnotations_Stub(java.rmi.server.RemoteRef ref) {
        super(ref);
    }

    // methods from remote interfaces

    // implementation of printErr(String)
    public void printErr(java.lang.String $param_String_1)
        throws java.rmi.RemoteException
    {
        try {
            if (useNewInvoke) {
                ref.invoke(this, $method_printErr_0, new java.lang.Object[] {$param_String_1}, 1120261287704800747L);
            } else {
                java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 0, interfaceHash);
                try {
                    java.io.ObjectOutput out = call.getOutputStream();
                    out.writeObject($param_String_1);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException("error marshalling arguments", e);
                }
                ref.invoke(call);
                ref.done(call);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException("undeclared checked exception", e);
        }
    }

    // implementation of printOut(String)
    public void printOut(java.lang.String $param_String_1)
        throws java.rmi.RemoteException
    {
        try {
            if (useNewInvoke) {
                ref.invoke(this, $method_printOut_1, new java.lang.Object[] {$param_String_1}, -7517735248176918178L);
            } else {
                java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 1, interfaceHash);
                try {
                    java.io.ObjectOutput out = call.getOutputStream();
                    out.writeObject($param_String_1);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException("error marshalling arguments", e);
                }
                ref.invoke(call);
                ref.done(call);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException("undeclared checked exception", e);
        }
    }

    // implementation of shutdown()
    public void shutdown()
        throws java.lang.Exception
    {
        if (useNewInvoke) {
            ref.invoke(this, $method_shutdown_2, null, -7207851917985848402L);
        } else {
            java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 2, interfaceHash);
            ref.invoke(call);
            ref.done(call);
        }
    }
}