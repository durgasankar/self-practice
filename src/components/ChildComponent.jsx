import React from 'react'

function ChildComponent(props) {
    return (
        <div>
            {/* Data is sent through the parameter of the property */}
            <button onClick={() => props.greetHandler('Durgasankar Mishra')}>Greet Parents</button>
        </div>
    )
}

export default ChildComponent
