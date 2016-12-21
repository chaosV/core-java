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
			System.out.println(this.name + " 技能对"+role.name+"造成了" + (skills[a.nextInt(4)].skillValue + attackPower) + "点伤害！");
			role.beHit(skills[a.nextInt(4)].skillValue + attackPower);
		} else {
			this.currentBlood = this.currentBlood - this.attackPower;
			System.out.println(this.name + " 普同攻击对"+role.name+"造成了" + attackPower + "伤害！");
			role.beHit(this.attackPower);
		}
	}

	public void beHit(int attack) {
		System.out.println(this.name + " 受到" + attack + "伤害！");
		if (skills[a.nextInt(4)].skilltype == SkillType.PROTECT) {
				attack = attack- skills[a.nextInt(4)].skillValue;
				if(attack<0){
					attack=0;
				}this.currentBlood = this.currentBlood - attack;
				
				//System.out.println(this.name + " 技能造成了" + skills[a.nextInt(4)].skillValue + "点伤害！");
			}if(this.currentBlood<0){
				System.out.println(this.name+" 已阵亡" );
					
				}else {
					System.out.println(this.name+" 当前生命值：" + this.currentBlood);
				}
		
			}
		 



	public String toString() {
		return ("姓名：" + name + " 血量：" + blood + " 初始攻击力：" + attackPower);
	}

}
