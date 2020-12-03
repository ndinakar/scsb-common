package org.recap.model.transfer;

import org.recap.model.BaseModel;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by sheiks on 12/07/17.
 */
@Getter
@Setter
public class HoldingsTransferRequest implements BaseModel {
    private Source source;
    private Destination destination;
}
