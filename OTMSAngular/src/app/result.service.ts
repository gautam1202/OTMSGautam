import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http'
import { Tests } from './test';
import { Questions } from './question';

@Injectable({
  providedIn: 'root'
})
export class ResultService {


question:Questions = new Questions();
test:Tests = new Tests();

questions:Questions[];


  constructor(private http:HttpClient) { }
  getResult(testId:number):Observable<any>
 {
  //let url = "http://localhost:1180/getresult";
  return this.http.get("http://localhost:1180/getresult/"+testId);
 }

 
 calculateTotalMarks(testId:number):Observable<any>
 {
  //let url = "http://localhost:1180/calculate-marks";
  return this.http.get("http://localhost:1180/calculate-marks/"+testId);
 }

 testList():Observable<any>
 {
   return this.http.get("http://localhost:1180/getresultlist");
 }


//  createTest(test:Tests):Observable<any>
//  {
//    let url = "http://localhost:1998/test/new";
//    return this.http.post(url, test, {responseType:'text'});
//  }

//  createQuestion(question:Questions):Observable<any>
//  {
//    let url = "http://localhost:1998/question/new";
//    return this.http.post(url, question, {responseType:'text'})
//  }

//   getUser(id:number):Observable<any>
//   {
//     let url = "http://localhost:1998/user/"+id;
//     return this.http.get(url);
//   }

//  getTestList():Observable<any>
//  {
//    let url = "http://localhost:1998/test";
//    return this.http.get(url);
//  }

//  getQuestionList(testId:number):Observable<any>
//  {
//    let url = "http://localhost:1998/question/list/"+testId;
//    return this.http.get(url);
//  }

//  addQuestion(question:Questions)
//  {
//     this.questions.push(question)
//     alert(this.questions[1].questionId)
//  }

//  retrievQuest():Questions[]
//  {
//   return this.questions;
//  }

//  getAllQuestion():Observable<any>
//  {
//    let url = "http://localhost:1998/question";
//    return this.http.get(url);
//  }

//   setTest(test:Tests)
//   {
//      this.test = test;
//   }

//   setQuestion(question:Questions)
//   {
//     this.question = question;
//   }

//   getTest():Tests
//   {
//     return this.test;
//   }

//  getQuestion():Questions
//  {
//    return this.question;
//  }

//   deleteQuestion(id:number):Observable<any>
//   {
//    let url = "http://localhost:1998/question/delete/"+id;
//    return this.http.delete(url, {responseType:'text'});
//   }

//   deleteTest(testId:number):Observable<any>
//   {
//     let url = "http://localhost:1998/test/delete/"+testId;
//     return this.http.delete(url, {responseType:'text'});
//   }

//  updateQuestion(quest:Questions):Observable<any>
//  {
//      let url= "http://localhost:1998/question/update";
//      return this.http.put(url, quest, {responseType:'text'});
//  }

//  updateTest(test:Tests):Observable<any>
//  {
//    let url = "http://localhost:1998/test/update";
//    return this.http.put(url, test, {responseType:'text'});
//  }

//  assignTest(test):Observable<any>
//  {
//     let url = "http://localhost:1998/assign/test";
//     return this.http.put(url, test, {responseType:'text'});
//  }

 }
