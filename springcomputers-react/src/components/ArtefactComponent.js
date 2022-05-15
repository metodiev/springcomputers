import React from "react";
import ArtefactService from "../services/ArtefactService";

class ArtefactComponent extends React.Component {
    constructor (props) {
        super(props)
        this.state = {
            artefacts:[]
        }
    }

    componentDidMount(){
        ArtefactService.getArtefacts().then((response) => {
            this.setState({ artefacts: response.data})
        });
    }
    render(){
        return(
            <div>
                <h1 className="text-center">Artefacts List</h1>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <td>Artefact ID</td>
                            <td>Artefact Name</td>
                            <td>Artefact Price</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.artefacts.map(
                                artefact =>
                                <tr key = {artefact.id}>
                                    <td>{artefact.id}</td>    
                                    <td>{artefact.name}</td>    
                                    <td>{artefact.price}</td>    
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}

export default ArtefactComponent
