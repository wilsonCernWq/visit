package llnl.visit.operators;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;

// ****************************************************************************
// Class: ProjectAttributes
//
// Purpose:
//    Project data from three to two dimensions
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Tue May 18 14:35:42 PST 2004
//
// Modifications:
//   
// ****************************************************************************

public class ProjectAttributes extends AttributeSubject implements Plugin
{
    // Constants
    public final static int PROJECTIONTYPE_XYCARTESIAN = 0;
    public final static int PROJECTIONTYPE_ZRCYLINDRICAL = 1;


    public ProjectAttributes()
    {
        super(1);

        projectionType = PROJECTIONTYPE_XYCARTESIAN;
    }

    public ProjectAttributes(ProjectAttributes obj)
    {
        super(1);

        projectionType = obj.projectionType;

        SelectAll();
    }

    public boolean equals(ProjectAttributes obj)
    {
        // Create the return value
        return ((projectionType == obj.projectionType));
    }

    public String GetName() { return "Project"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetProjectionType(int projectionType_)
    {
        projectionType = projectionType_;
        Select(0);
    }

    // Property getting methods
    public int GetProjectionType() { return projectionType; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(projectionType);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        buf.ReadByte();
        SetProjectionType(buf.ReadInt());
    }


    // Attributes
    private int projectionType;
}

