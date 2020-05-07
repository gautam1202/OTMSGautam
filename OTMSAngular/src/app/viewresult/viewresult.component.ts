import { Component, OnInit } from '@angular/core';
import { Tests } from '../test';
import { Questions } from '../question';
import { ResultService } from '../result.service';
@Component({
  selector: 'viewresult',
  templateUrl: './viewresult.component.html',
  styleUrls: ['./viewresult.component.css']
})
export class ViewresultComponent implements OnInit {
  tests:Tests[]=[];
  marks:number;
  questions:Questions[]=[];
  constructor(private resultservice:ResultService) { }
  
  ngOnInit()  {
    this.resultservice.testList().subscribe(
      (data)=>
      {
        this.tests=data;
      }
    );
  }
  calculateResult(testId:number):void {
    
    this.resultservice.calculateTotalMarks(testId).subscribe((data)=>
    {
      this.marks=data;});
    }

    


}
