import { Component, OnInit } from '@angular/core';
import { Tests } from '../test';
import { Questions } from '../question';
import { ResultService } from '../result.service';

@Component({
  selector: 'results',
  templateUrl: './results.component.html',
  styleUrls: ['./results.component.css']
})
export class ResultsComponent implements OnInit {
  // tests:Tests[]=[];
  // questions:Questions[]=[];
  // constructor(private resultservice:ResultService) { }

  ngOnInit(): void {
  //   this.resultservice.getResult().subscribe(
  //     data=>{this.tests=data},
  //     data=>{this.questions=data}
  }
  }
