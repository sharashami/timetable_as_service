import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

import {Professor} from '../models/professor.model';

const htttOptions = {
    headers : new HttpHeaders( { 'Content-Type' : 'application/json'})
};

@Injectable()
export class ProfessorService{
    constructor (private http : HttpClient) {}

    //private userUrl = 'http://localhost:8080/user-portal/user';
    private professorUrl = '/api/professors';
    
    public getProfessors(){
        return this.http.get<Professor[]>(this.professorUrl);
    }

    
    public deleteProfessor(professor){
        //
    }

}