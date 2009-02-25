package org.xtreemfs.interfaces.DIRInterface;

import org.xtreemfs.interfaces.*;
import org.xtreemfs.interfaces.DIRInterface.*;

import org.xtreemfs.interfaces.utils.*;

import org.xtreemfs.foundation.oncrpc.utils.ONCRPCBufferWriter;
import org.xtreemfs.common.buffer.ReusableBuffer;
import org.xtreemfs.common.buffer.BufferPool;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;


         

public class registerServiceResponse implements Response
{
    public registerServiceResponse() { returnValue = 0; }
    public registerServiceResponse( long returnValue ) { this.returnValue = returnValue; }

    public long getReturnValue() { return returnValue; }
    public void setReturnValue( long returnValue ) { this.returnValue = returnValue; }

    // Object
    public String toString()
    {
        return "registerServiceResponse( " + Long.toString( returnValue ) + " )";
    }    

    // Serializable
    public String getTypeName() { return "xtreemfs::interfaces::DIRInterface::registerServiceResponse"; }    
    
    public void serialize(ONCRPCBufferWriter writer) {
        writer.putLong( returnValue );        
    }
    
    public void deserialize( ReusableBuffer buf )
    {
        returnValue = buf.getLong();    
    }
    
    public int calculateSize()
    {
        int my_size = 0;
        my_size += ( Long.SIZE / 8 );
        return my_size;
    }

    private long returnValue;
    

    // Response
    public int getInterfaceVersion() { return 1; }
    public int getOperationNumber() { return 4; }    

}

