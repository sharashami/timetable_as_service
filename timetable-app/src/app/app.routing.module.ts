import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import {ProfessorComponent} from './professor/professor.component';

const routes: Routes = [
    { path: 'professors', component: ProfessorComponent }
  ];

@NgModule({ 
    imports :[
        RouterModule.forRoot(routes)
    ],
    exports: [
        RouterModule
    ],
    declarations: []

})

export class AppRoutingModule {}