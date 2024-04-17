package asik.propensik.trainnas.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdatePelatihanRequestDTO extends CreatePelatihanRequestDTO {
    private Long idPelatihan;
}