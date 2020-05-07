import { Component, OnInit, ViewChild} from '@angular/core';
import { Questions } from '../../question';
import { NgForm, FormsModule,FormControl} from '@angular/forms';

import { Option } from '../../option';
import { ResultService } from 'src/app/result.service';
import {HttpClientModule} from '@angular/common/http';


@Component({
  selector: 'app-add-question',
  templateUrl: './add-question.component.html',
  styleUrls: ['./add-question.component.css']
})


export class AddQuestionComponent implements OnInit {

 @ViewChild("#formdata")
 form:NgForm;

  constructor(private service:ResultService) { }

  question:Questions = new Questions();
  questions:Questions[] =[];

  ngOnInit(): void {
  }


}
