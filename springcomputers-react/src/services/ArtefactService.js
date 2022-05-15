import axios from "axios";

const ARTEFACTS_REAST_API = 'http://localhost:8080/api/artefacts';

class ArtefactService {
    
    getArtefacts(){
       return axios.get(ARTEFACTS_REAST_API);
    }
}

export default new ArtefactService();