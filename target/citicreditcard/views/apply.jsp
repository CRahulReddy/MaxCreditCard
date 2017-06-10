
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="saveapplicant" method="POST">
		<div class="container">

			<div class="panel-group" id="accordion">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse1">Name</a>
						</h4>
					</div>
					<div id="collapse1" class="panel-collapse collapse in">
						<div class="panel-body">

							<div class="form-group">

								<input type="input" class="form-control" name="firstName"
									placeholder="FirstName">
							</div>
							<div class="form-group">

								<input type="input" class="form-control" name="middleName"
									placeholder="MiddleName">
							</div>
							<div class="form-group">

								<input type="input" class="form-control" name="lastName"
									placeholder="LastName">
							</div>


						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse2">Home Address</a>
						</h4>
					</div>
					<div id="collapse2" class="panel-collapse collapse">
						<div class="panel-body">

							<div class="form-group">

								<input type="input" class="form-control"
									name="address.addressLine1" placeholder="Home Address">
							</div>
							<div class="form-group">

								<input type="input" class="form-control"
									name="address.addressLine2" placeholder="Apt/Ste">
							</div>
							<div class="form-group">

								<input type="input" class="form-control" name="address.city"
									placeholder="City">
							</div>
							<div class="form-group">

								<input type="input" class="form-control" name="address.state"
									placeholder="State">
							</div>
							<div class="form-group">

								<input type="input" class="form-control" name="address.zip"
									placeholder="Zip">
							</div>


						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse3">Telephone </a>
						</h4>
					</div>
					<div id="collapse3" class="panel-collapse collapse">
						<div class="panel-body">

							<div class="form-group">

								<input type="telephone" class="form-control" name="phoneNumber"
									placeholder="Primary Number">
							</div>



						</div>
					</div>
				</div>


				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse4">Email</a>
						</h4>
					</div>
					<div id="collapse4" class="panel-collapse collapse">
						<div class="panel-body">


							<div class="form-group">

								<input type="email" class="form-control" name="email"
									placeholder="Email ">
							</div>

						</div>
					</div>
				</div>


				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse5">Date-of-Birth</a>
						</h4>
					</div>
					<div id="collapse5" class="panel-collapse collapse">
						<div class="panel-body">

							<div class="form-group">

								<input type="date" class="form-control" name="dob"
									placeholder="Date-of-Birth ">
							</div>

						</div>
					</div>
				</div>


				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse6">SSN</a>
						</h4>
					</div>
					<div id="collapse6" class="panel-collapse collapse">
						<div class="panel-body">


							<div class="form-group">

								<input type="password" class="form-control" name="ssn"
									placeholder="SSN ">
							</div>


						</div>
					</div>
				</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#collapse7">Annual Income</a>
					</h4>
				</div>
				<div id="collapse7" class="panel-collapse collapse">
					<div class="panel-body">

						<div class="form-group">

							<input type="text" class="form-control" name="annualIncome"
								placeholder="Annual Income ">
						</div>
						<div class="form-group">

							<input type="text" class="form-control" name="rentMortage"
								placeholder=" HouseMortage/Monthly-Rent Payment">
						</div>

					</div>
				</div>
			</div>
		</div>

		</div>
		</div>
		<div align="center">
			<input type="submit" value="submit" class="btn btn-primary">
		</div>

		<!--     </form> 
      <input type="checkbox"  value="Input Button" onclick="location.href ='#dependent'">
    <div id="dependent" >
    <form action="" method="POST">
    <input type="text" placeholder="FirstName" id="firstName">
       <input type="text" placeholder="LastName" id="lastName">
          <input type="text" placeholder="Email" id="email">
             <input type="text" placeholder="Gender" id="gender">
                <input type="text" placeholder="Date-of-Birth" id="dateOfBirth">
                   <input type="text" placeholder="Address" id="addressLine1">
                      <input type="text" placeholder="APt,ste" id="addressLine2">
                         <input type="text" placeholder="City" id="city">
                            <input type="text" placeholder="State" id="state">
                               <input type="text" placeholder="Zip" id="zip">
                                  <input type="submit" value="submit">
    
    </form>
    </div> -->
</body>
</html>
