package lol;

import java.util.Random;

public class Hero extends Role {
	public Skill q;
	public Skill w;
	public Skill e;
	public Skill r;
	public Skill[] skills = new Skill[4];
	Random a = new Random();

	public Hero(String name) {
		super(name);
		this.q = new Skill();
		this.w = new Skill();
		this.e = new Skill();
		this.r = new Skill();
		skills[0] = q;
		skills[1] = w;
		skills[2] = e;
		skills[3] = r;
	}

	// public void Skill(){
	// q=new Skill();
	// System.out.println(q);
	//
	// }
	public void hit(Role role) {
		if (skills[a.nextInt(4)].skilltype == SkillType.ATTACT) {
			//this.currentBlood = this.currentBlood - (skills[a.nextInt(4)].skillValue + attackPower);
			System.out.println(this.name + " ���ܶ�"+role.name+"�����" + (skills[a.nextInt(4)].skillValue + attackPower) + "���˺���");
			role.beHit(skills[a.nextInt(4)].skillValue + attackPower);
		} else {
			this.currentBlood = this.currentBlood - this.attackPower;
			System.out.println(this.name + " ��ͬ������"+role.name+"�����" + attackPower + "�˺���");
			role.beHit(this.attackPower);
		}
	}

	public void beHit(int attack) {
		System.out.println(this.name + " �ܵ�" + attack + "�˺���");
		if (skills[a.nextInt(4)].skilltype == SkillType.PROTECT) {
				attack = attack- skills[a.nextInt(4)].skillValue;
				if(attack<0){
					attack=0;
				}this.currentBlood = this.currentBlood - attack;
				
				//System.out.println(this.name + " ���������" + skills[a.nextInt(4)].skillValue + "���˺���");
			}if(this.currentBlood<0){
				System.out.println(this.name+" ������" );
					
				}else {
					System.out.println(this.name+" ��ǰ����ֵ��" + this.currentBlood);
				}
		
			}
		 



	public String toString() {
		return ("������" + name + " Ѫ����" + blood + " ��ʼ��������" + attackPower);
	}

}
