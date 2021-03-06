package org.xtreemfs.common.monitoring.generatedcode;

//
// Generated by mibgen version 5.1 (03/08/07) when compiling XTREEMFS-MIB.
//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import javax.management.MBeanServer;
import com.sun.management.snmp.SnmpString;
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;

/**
 * The class is used for implementing the "Dir" group.
 * The group is defined with the following oid: 1.3.6.1.4.1.38350.2.
 */
public class Dir implements DirMBean, Serializable {

    /**
     * Variable for storing the value of "ServiceCount".
     * The variable is identified by: "1.3.6.1.4.1.38350.2.2".
     */
    protected Integer ServiceCount = new Integer(1);

    /**
     * Variable for storing the value of "AddressMappingCount".
     * The variable is identified by: "1.3.6.1.4.1.38350.2.1".
     */
    protected Integer AddressMappingCount = new Integer(1);


    /**
     * Constructor for the "Dir" group.
     * If the group contains a table, the entries created through an SNMP SET will not be registered in Java DMK.
     */
    public Dir(SnmpMib myMib) {
    }


    /**
     * Constructor for the "Dir" group.
     * If the group contains a table, the entries created through an SNMP SET will be AUTOMATICALLY REGISTERED in Java DMK.
     */
    public Dir(SnmpMib myMib, MBeanServer server) {
    }

    /**
     * Getter for the "ServiceCount" variable.
     */
    public Integer getServiceCount() throws SnmpStatusException {
        return ServiceCount;
    }

    /**
     * Getter for the "AddressMappingCount" variable.
     */
    public Integer getAddressMappingCount() throws SnmpStatusException {
        return AddressMappingCount;
    }

}
