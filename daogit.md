# DAO Git

Motivations & Requirements
- Regulatory Requirements
- Legal Design Constraints
- Need for New Legisltation


Application
- Legal Entity (e.g. companies)

Implementation and Migration

Technology & "Physical"
- Legal Protocol (Business Object)

### Implementation and Migration
The Implementation and Migration viewpoint is used to relate programs and projects to the parts of the architecture that they implement. This view allows modeling of the scope of programs, projects, project activities in terms of the plateaus that are realized or the individual architecture elements that are affected. In addition, the way the elements are affected may be indicated by annotating the relationships.

Furthermore, this viewpoint can be used in combination with the programs and projects viewpoint to support portfolio management:

The programs and projects viewpoint is suited to relate business goals to programs and projects. For example, this makes it possible to analyze at a high level whether all business goals are covered sufficiently by the current portfolio(s).
The implementation and migration viewpoint is suited to relate business goals (and requirements) via programs and projects to (parts of) the architecture. For example, this makes it possible to analyze potential overlap between project activities or to analyze the consistency between project dependencies and dependencies among plateaus or architecture elements.

Stakeholders: (Operational) managers, enterprise and ICT architects, employees, shareholders
Concerns: Architecture vision and policies, motivation
Purpose: Deciding, informing
Scope: Multiple layer/Multiple aspect

### Product Viewpoint
The Product viewpoint depicts the value that these products offer to the customers or other external parties involved and shows the composition of one or more products in terms of the constituting (business, application, or technology) services, and the associated contract(s) or other agreements. It may also be used to show the interfaces (channels) through which this product is offered, and the events associated with the product. A product viewpoint is typically used in product development to design a product by composing existing services or by identifying which new services have to be created for this product, given the value a customer expects from it. It may then serve as input for business process architects and others that need to design the processes and ICT realizing these products.

Stakeholders: Product developers, product managers, process and domain architects
Concerns: Product development, value offered by the products of the enterprise
Purpose: Designing, deciding
Scope: Multiple layer/Multiple aspect

### Application Usage

The Application Usage viewpoint describes how applications are used to support one or more business processes, and how they are used by other applications. It can be used in designing an application by identifying the services needed by business processes and other applications, or in designing business processes by describing the services that are available. Furthermore, since it identifies the dependencies of business processes upon applications, it may be useful to operational managers responsible for these processes.

Stakeholders: Enterprise, process, and application architects, operational managers

### Requirements

 A Requirement represents a statement of need defining a property that applies to a specific system as described by the architecture.

Requirements model the properties of these elements that are needed to achieve the "ends" that are modelled by the goals. In this respect, requirements represent the "means" to realize goals.

Category: Motivation
Examples: "Assign personal assistant", "Provide on-line portfolio service", "Provide on-line information service", "Use open source software"

#### Business Service
A Business Service represents explicitly defined behavior that a Business Role, Business Actor, or Business Collaboration exposes to its environment.

A Business Service is defined as the externally visible ("logical") functionality, which is meaningful to the environment and is realized by business behaviour (Business Process, Business Function, or Business Interaction).

A Business Service exposes the functionality of Business Roles or Collaborations to their environment. This functionality is accessed through one or more business interfaces. A Business Service is realized by one or more Business Processes, Business Functions, or Business Interactions that are performed by the Business Roles or Business Collaborations, respectively.

The name of a Business Service should preferably be a verb ending with "-ing"; e.g., "transaction processing". Also, a name containing the word "service" may be used.

Category: Business. Behavioural.
Examples: Customer Information Service, Claims Payment Service, Enrolment Service.


#### Application Service

An Application Service represents an explicitly defined exposed application behaviour.

An Application Service exposes the functionality of components to their environment. This functionality is accessed through one or more Application Interfaces. An Application Service is realized by one or more Application Functions that are performed by the component. It may require, use, and produce Data Objects.

An Application Service should provide a unit of behaviour that is, in itself, useful to its users. It has a purpose, which states this utility to the environment.

A Purpose may be associated with an Application Service. An Application Service may serve Business Processes, Business Functions, Business Interactions, or Application Functions. An Application Function may realize an Application Service. An Application Interface may be assigned to an Application Service. An Application Service may access Data Objects.


#### Data Object

A Data Object represents data structured for automated processing.

A Data Object should be a self-contained piece of information with a clear meaning to the business, not just to the application level.

A Data Object typically models an object type of which multiple instances may exist in operational applications.

An Application Function or process can operate on Data Objects. A Data Object may be communicated via interactions and used or produced by Application Services. A Data Object can be accessed by an Application Function, Application Interaction, or Application Service. A Data Object may realize a Business Object, and may be realized by an Artifact. A Data Object may have Association, Specialization, Aggregation, or Composition relationships with other Data Objects.

The name of a Data Object should preferably be a noun.

Category: Application. Passive Structure.

Examples: Customer File Data, Insurance Policy Data, Insurance Request Data, Client Database.

** The name of an Application Service should preferably be a verb ending with "ing".** Also, a name explicitly containing the word "service" may be used.

Category: Application. Behavioural.

Examples: Transaction Processing, Payment Service, Customer Admin Service.