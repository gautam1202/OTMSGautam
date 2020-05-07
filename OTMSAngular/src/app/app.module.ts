import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { QuestionsComponent } from './questions/questions.component';
import { TestsComponent } from './tests/tests.component';
import { UsersComponent } from './users/users.component';
import { AddTestComponent } from './tests/add-test/add-test.component';
import { UpdateTestComponent } from './tests/update-test/update-test.component';
import { DeleteTestsComponent } from './tests/delete-tests/delete-tests.component';
import { AddQuestionComponent } from './questions/add-question/add-question.component';
import { ShowTestsComponent } from './tests/show-tests/show-tests.component';
import { UpdateQuestionComponent } from './questions/update-question/update-question.component';
import { DeleteQuestionComponent } from './questions/delete-question/delete-question.component';
import { ShowQuestionsComponent } from './questions/show-questions/show-questions.component';
import { CalculateTotalmarksComponent } from './results/calculate-totalmarks/calculate-totalmarks.component';
// import { ShowResultComponent } from './results/show-result/show-result.component';
import { HomeComponent } from './home/home.component';
import { ShowUsersComponent } from './users/show-users/show-users.component';
import { ViewresultComponent} from './viewresult/viewresult.component';
import {HttpClientModule} from '@angular/common/http';
import { from } from 'rxjs';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    QuestionsComponent,
    TestsComponent,
    UsersComponent,
    AddTestComponent,
    UpdateTestComponent,
    DeleteTestsComponent,
    AddQuestionComponent,
    UpdateQuestionComponent,
    DeleteQuestionComponent,
    ShowQuestionsComponent,
    CalculateTotalmarksComponent,
    // ShowResultComponent,
    HomeComponent,
    ShowUsersComponent,
    ViewresultComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
