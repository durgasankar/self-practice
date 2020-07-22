import React, { Component } from 'react';

class StateExample extends Component {

    constructor() {
        super()
        this.state = {
            message: 'Please Suscribe the chennal'
        }
    }

    displayClickedOperation() {
        this.setState({
            message: 'Thank You for Suscribing'
        })
    }

    render() {
        return (
            <div >
                <h1>{this.state.message}</h1>
                <button onClick={() => this.displayClickedOperation()}>Suscribe</button>
            </div>
        )
    }
}
export default StateExample;