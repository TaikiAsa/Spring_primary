package com.example.demo.app.survey;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SurveyForm{

	/*Add parameters(0~150) 引数を追加(0~150)*/
	@NotNull
	@Max(value=150, message="0~150の数字を入力してください")
	@Min(value=0, message="0~150の数字を入力してください")
    private int age;
    
    /*Add parameters(1~5) 引数を追加(1~5)*/
	@NotNull
	@Max(value=5, message="選択して下さい")
	@Min(value=1, message="選択して下さい")
    private int satisfaction;

    /*Add parameters(200 characters or less) 引数を追加(200文字以内)*/
	@Size(min = 0, max = 200, message = "200文字以内で入力してください")
	private String comment;
	
	public SurveyForm() {};
	
    public SurveyForm(int age, int satisfaction, String comment) {
		this.age = age;
		this.satisfaction = satisfaction;
		this.comment = comment;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSatisfaction() {
		return satisfaction;
	}


	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}

}