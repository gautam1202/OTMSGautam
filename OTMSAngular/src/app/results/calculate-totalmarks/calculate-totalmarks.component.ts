import { Component, OnInit,ViewChild } from '@angular/core';
import { Tests} from '../../test';
import { Questions } from '../../question';
import { from } from 'rxjs';
import {HttpClientModule} from '@angular/common/http';
import { ResultService } from 'src/app/result.service';


@Component({
  selector: 'app-calculate-totalmarks',
  templateUrl: './calculate-totalmarks.component.html',
  styleUrls: ['./calculate-totalmarks.component.css']
})
export class CalculateTotalmarksComponent implements OnInit {

  constructor(private service:ResultService) { }
  test:Tests= new Tests();
  question: Questions=new Questions();

  ngOnInit(): void {
   
  }

}
