package com.wutka.dtd;

import java.io.*;
import java.util.*;

/** Represents a choice of items.
 * A choice in a DTD looks like (option1 | option2 | option3)
 *
 * @author Mark Wutka
 * @version $Revision: 1.1 $ $Date: 2005/07/29 05:07:31 $ by $Author: pavels $
 */
public class DTDChoice extends DTDContainer
{
    public DTDChoice()
    {
    }

/** Writes out the possible choices to a PrintWriter */
    public void write(PrintWriter out)
        throws IOException
    {
        out.print("(");
        Enumeration e = getItemsVec().elements();
        boolean isFirst = true;

        while (e.hasMoreElements())
        {
            if (!isFirst) out.print(" | ");
            isFirst = false;

            DTDItem item = (DTDItem) e.nextElement();

            item.write(out);
        }
        out.print(")");
        cardinal.write(out);
    }

    public boolean equals(Object ob)
    {
        if (ob == this) return true;
        if (!(ob instanceof DTDChoice)) return false;

        return super.equals(ob);
    }
}
