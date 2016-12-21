package com.qk;

public class Point3D extends Point2D {
	public float z;
	
	
	public Point3D(){
		
	}
	
	
	public Point3D(float x,float y,float z){
		this.x=x;
		this.y=y;
		this.z=z;
	}


	public float getZ() {
		return z;
	}


	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x,float y,float z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	
	public float[] getXYZ(){
		float[] getXYZ={x,y,z};
		return getXYZ;
	}
	
	public String toString(){
		return ("( "+x+" ,"+y+" ,"+z+" )");
	}
}
