/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public final class MgSnapType {
  public final static MgSnapType kMgSnapNone = new MgSnapType("kMgSnapNone");
  public final static MgSnapType kMgSnapSameX = new MgSnapType("kMgSnapSameX");
  public final static MgSnapType kMgSnapSameY = new MgSnapType("kMgSnapSameY");
  public final static MgSnapType kMgSnapGridX = new MgSnapType("kMgSnapGridX");
  public final static MgSnapType kMgSnapGridY = new MgSnapType("kMgSnapGridY");
  public final static MgSnapType kMgSnapPoint = new MgSnapType("kMgSnapPoint");
  public final static MgSnapType kMgSnapCenter = new MgSnapType("kMgSnapCenter");
  public final static MgSnapType kMgSnapMidPoint = new MgSnapType("kMgSnapMidPoint");
  public final static MgSnapType kMgSnapGrid = new MgSnapType("kMgSnapGrid");
  public final static MgSnapType kMgSnapIntersect = new MgSnapType("kMgSnapIntersect");
  public final static MgSnapType kMgSnapPerp = new MgSnapType("kMgSnapPerp");
  public final static MgSnapType kMgSnapNearPt = new MgSnapType("kMgSnapNearPt");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MgSnapType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MgSnapType.class + " with value " + swigValue);
  }

  private MgSnapType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MgSnapType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MgSnapType(String swigName, MgSnapType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MgSnapType[] swigValues = { kMgSnapNone, kMgSnapSameX, kMgSnapSameY, kMgSnapGridX, kMgSnapGridY, kMgSnapPoint, kMgSnapCenter, kMgSnapMidPoint, kMgSnapGrid, kMgSnapIntersect, kMgSnapPerp, kMgSnapNearPt };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
