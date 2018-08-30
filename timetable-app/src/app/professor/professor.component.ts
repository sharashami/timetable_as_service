import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { Professor } from '../models/professor.model';
import { ProfessorService} from './professor.service';

@Component({
  selector: 'app-professor',
  templateUrl: './professor.component.html',
  styles : []
 // styleUrls: ['./professor.component.css']
  
})
export class ProfessorComponent implements OnInit {

    professors: Professor[];
    
  constructor(private router: Router, private professorService : ProfessorService) {
    
  
  }

  ngOnInit() {
    this.professorService.getProfessors()
        .subscribe( data => {
            this.professors = data;
        });
  }
  
  

}
