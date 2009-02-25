/*  Copyright (c) 2009 Konrad-Zuse-Zentrum fuer Informationstechnik Berlin.

    This file is part of XtreemFS. XtreemFS is part of XtreemOS, a Linux-based
    Grid Operating System, see <http://www.xtreemos.eu> for more details.
    The XtreemOS project has been developed with the financial support of the
    European Commission's IST program under contract #FP6-033576.

    XtreemFS is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free
    Software Foundation, either version 2 of the License, or (at your option)
    any later version.

    XtreemFS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with XtreemFS. If not, see <http://www.gnu.org/licenses/>.
*/
/*
 * AUTHORS: Björn Kolbeck (ZIB)
 */

package org.xtreemfs.interfaces.utils;


public class ONCRPCRecordFragmentHeader {


    public static int getFragmentHeaderSize() {
        return Integer.SIZE/8;
    }

    public static int getFragmentLength(int fragmentHeader) {
        return fragmentHeader ^ (1 << 31);
    }

    public static boolean isLastFragment(int fragmentHeader) {
        return (fragmentHeader >> 31) != 0;
    }

    public static int getFragmentHeader(int fragmentLength, boolean isLastFragment) {
        if (isLastFragment) {
            return fragmentLength | (1 << 31);
        } else {
            return fragmentLength;
        }
    }

};
