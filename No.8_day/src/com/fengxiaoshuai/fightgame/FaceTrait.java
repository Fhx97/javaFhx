package com.fengxiaoshuai.fightgame;

import java.util.Random;

public class FaceTrait {
    // 定义面部特征
    public void facetrait(UserOpt role){
        String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
        String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};
        Random r = new Random();
        int r_index = r.nextInt(7);
        if(role.getGender()=='男'){
            role.setFace(boyfaces[r_index]);
        }else if (role.getGender()=='女'){
            role.setFace(girlfaces[r_index]);
        }else{
            role.setFace("无法描述！！！");
        }

    }
}
