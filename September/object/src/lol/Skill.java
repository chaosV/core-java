package lol;

import java.util.Random;

public class Skill {
	
	public SkillType skilltype;
	public int skillValue;
	
	
	public Skill(){
		this.skillValue = initSkillValue();
		this.skilltype=initSkillType();
	}
	

	public SkillType initSkillType(){
		Random r = new Random();
		int a=r.nextInt(2);
		if(a==0){
		return SkillType.ATTACT;
		}else {
			return SkillType.PROTECT;
		}
	}
	
	public int  initSkillValue(){
//		Random r = new Random();
//		r.nextInt(10);
		return (int)(Math.random()*10 + 10);
		
	}

	public SkillType getSkilltype() {
		return skilltype;
	}

	public void setSkilltype(SkillType skilltype) {
		this.skilltype = skilltype;
	}

	public int getSkillValue() {
		return skillValue;
	}

	public  void setSkillValue(int skillValue){
		this.skillValue=skillValue;
	}
	
	public void print(){
		System.out.println(getSkillValue());
	}
}
