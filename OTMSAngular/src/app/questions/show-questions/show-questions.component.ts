import { Component, OnInit } from '@angular/core';
import { Questions } from 'src/app/question';
import { ResultService } from 'src/app/result.service';
import {HttpClientModule} from '@angular/common/http';

@Component({
  selector: 'app-show-questions',
  templateUrl: './show-questions.component.html',
  styleUrls: ['./show-questions.component.css']
})
export class ShowQuestionsComponent implements OnInit {

  constructor(private service:ResultService) { }

  test:Questions = new Questions();
  questions:Questions[];

  

  ngOnInit(): void {

    

  }

}
