import React from 'react';

// with using jsx 
export const JsxExample = (props) => {
    console.log("properties : ", props);

    return (
        <div className='dummyClass' id='dummyId'>
            <h2>
                Welcome {props.name} to jsx with technology {props.tech}
            </h2>
        </div>
    )
}

// without using jsx
export const WithoutJsxExample = () => {
    return React.createElement('div', { id: 'dummyId', className: 'dummyClass' },
        React.createElement('h3', null, 'Welcome without using jsx')
    )
}

export default JsxExample;