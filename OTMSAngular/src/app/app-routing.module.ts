import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { QuestionsComponent } from './questions/questions.component';
import { AddQuestionComponent } from './questions/add-question/add-question.component';
import { ShowQuestionsComponent } from './questions/show-questions/show-questions.component';
import { HomeComponent } from './home/home.component';
import { TestsComponent } from './tests/tests.component';
import { ShowTestsComponent } from './tests/show-tests/show-tests.component';
import { ShowUsersComponent } from './users/show-users/show-users.component';
  import { from } from 'rxjs';
  import { ViewresultComponent} from './viewresult/viewresult.component';
import { UsersComponent } from './users/users.component';

const routes: Routes = [
  
  
  {path: 'home', component:HomeComponent},
  {path: '', component:HomeComponent},
  {path: "test-menu", component: TestsComponent},
  {path:"question-menu",component:QuestionsComponent},
  {path:'show-questions-all',component:ShowQuestionsComponent},
  {path: 'show-tests-all', component:ShowTestsComponent},
  {path: 'show-users-all', component:ShowUsersComponent},
  {path: 'add-question', component:AddQuestionComponent},
  {path: 'viewresult', component:ViewresultComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingcomponent =[ViewresultComponent,TestsComponent,UsersComponent,QuestionsComponent]

