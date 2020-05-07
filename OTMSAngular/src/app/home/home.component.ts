import { Component, OnInit } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { Tests } from '../test';
import { Questions } from '../question';
import { ResultService } from '../result.service';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  tests:Tests[]=[];
  questions:Questions[]=[];
  constructor(private resultservice:ResultService) { }


  ngOnInit(): void {

  }
}
